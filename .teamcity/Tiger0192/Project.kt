package Tiger0192

import Tiger0192.buildTypes.*
import Tiger0192.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0192")
    name = "Tiger0192"

    vcsRoot(Tiger0192_cVCSroot)

    buildType(Tiger0192_Hi3)
    buildType(Tiger0192_Hi0)
    buildType(Tiger0192_Hi1)
    buildType(Tiger0192_Hi2)
})
