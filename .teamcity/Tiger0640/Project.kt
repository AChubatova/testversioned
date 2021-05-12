package Tiger0640

import Tiger0640.buildTypes.*
import Tiger0640.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0640")
    name = "Tiger0640"

    vcsRoot(Tiger0640_cVCSroot)

    buildType(Tiger0640_Hi3)
    buildType(Tiger0640_Hi2)
    buildType(Tiger0640_Hi1)
    buildType(Tiger0640_Hi0)
})
