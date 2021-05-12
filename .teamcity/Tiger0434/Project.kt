package Tiger0434

import Tiger0434.buildTypes.*
import Tiger0434.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0434")
    name = "Tiger0434"

    vcsRoot(Tiger0434_cVCSroot)

    buildType(Tiger0434_Hi2)
    buildType(Tiger0434_Hi3)
    buildType(Tiger0434_Hi0)
    buildType(Tiger0434_Hi1)
})
