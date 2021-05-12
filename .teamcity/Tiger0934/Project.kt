package Tiger0934

import Tiger0934.buildTypes.*
import Tiger0934.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0934")
    name = "Tiger0934"

    vcsRoot(Tiger0934_cVCSroot)

    buildType(Tiger0934_Hi3)
    buildType(Tiger0934_Hi0)
    buildType(Tiger0934_Hi2)
    buildType(Tiger0934_Hi1)
})
