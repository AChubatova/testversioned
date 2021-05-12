package Tiger0184

import Tiger0184.buildTypes.*
import Tiger0184.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0184")
    name = "Tiger0184"

    vcsRoot(Tiger0184_cVCSroot)

    buildType(Tiger0184_Hi0)
    buildType(Tiger0184_Hi1)
    buildType(Tiger0184_Hi2)
    buildType(Tiger0184_Hi3)
})
